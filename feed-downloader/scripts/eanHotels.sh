#!/bin/bash
#script de feeds de EAN

tempDirectory="/home/jboss/data/ean/hotels/tempDirectory"
eanHotelsInput="/home/jboss/data/ean/hotels"


split_filter () { { echo "primer linea"; cat; } > "$FILE"; }
export -f split_filter

urls=("https://www.ian.com/affiliatecenter/include/V2/ActivePropertyList.zip" "https://www.ian.com/affiliatecenter/include/V2/PropertyDescriptionList_es_ES.zip")
nombres=("ActivePropertyList" "PropertyDescriptionList_es_ES")
metaUrl="http://192.168.254.147:8080/feed-downloader/inactivateEANHotels"

echo "Creando carpeta temporal"
mkdir -p $tempDirectory
cd $tempDirectory
index=0
echo "Desactivando EAN hotels en base de datos"
curl $metaUrl
for url in "${urls[@]}"
do
	echo "Bajando archivo ${nombres[index]}.zip"
	echo "url: $url"
	curl --retry 5 -O $url
	echo "Descomprimiendo archivo ${nombres[index]}.zip"
	unzip ${nombres[index]}.zip 
	echo "Spliteando y moviendo archivos a $eanHotelsInput"
	
	tail -n +2 ${nombres[index]}.txt | split -d --filter=split_filter - $eanHotelsInput/${nombres[index]}
	((index++))
done
echo "Borrando archivos temporales"
rm *.*