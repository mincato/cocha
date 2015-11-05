#!/bin/bash
#script de feeds de EAN para modelo de locations

tempDirectory="/home/jboss/data/ean/geo/tempDirectory"
eanGeoInput="/home/jboss/data/ean/geo"

split_filter () { { echo "primer linea"; cat; } > "$FILE"; }
export -f split_filter

urls=("https://www.ian.com/affiliatecenter/include/V2/CityCoordinatesList.zip" "https://www.ian.com/affiliatecenter/include/V2/AirportCoordinatesList.zip" "https://www.ian.com/affiliatecenter/include/V2/ParentRegionList.zip" "https://www.ian.com/affiliatecenter/include/V2/NeighborhoodCoordinatesList.zip" "https://www.ian.com/affiliatecenter/include/V2/PointsOfInterestCoordinatesList.zip" "https://www.ian.com/affiliatecenter/include/V2/RegionEANHotelIDMapping.zip")
nombres=("CityCoordinatesList" "AirportCoordinatesList" "ParentRegionList" "NeighborhoodCoordinatesList" "PointsOfInterestCoordinatesList" "RegionEANHotelIDMapping")

echo "Creando carpeta temporal"
mkdir -p $tempDirectory
cd $tempDirectory
index=0
for url in "${urls[@]}"
do
	echo "Bajando archivo ${nombres[index]}.zip"
	echo "url: $url"
	curl --retry 5 -O $url
	echo "Descomprimiendo archivo ${nombres[index]}.zip"
	unzip ${nombres[index]}.zip 
	echo "Spliteando y moviendo archivos a $eanGeoInput"
	
	tail -n +2 ${nombres[index]}.txt | split -d --filter=split_filter - $eanGeoInput/${nombres[index]}
	((index++))
done
echo "Borrando archivos temporales"
rm *.*
