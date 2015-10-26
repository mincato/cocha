#!/bin/bash
#script de feeds de BKG

if [ "$1" == "useLastChange" ];
then
	useLastChange=true
else
	useLastChange=false
fi

tempDirectory="/home/jboss/data/booking/hotels/tempDirectory"
eanHotelsInput="/home/jboss/data/booking/hotels"
lastChangeFile="/home/jboss/data/booking/hotelLastChange.txt"

urls=("https://distribution-xml.booking.com/xml/bookings.getHotels?rows=1000&offset=" "https://distribution-xml.booking.com/xml/bookings.getHotelDescriptionTranslations?rows=1000&languagecodes=es&offset=")
nombres=("hotels" "descriptions")
resultNode="<result>"

user="Cocha"
password="Cocha.123"

lastChangeParameter=""
if [ $useLastChange ]; then
	lastChangeParameter="&lastChange="
	if [ -f $lastChangeFile ];
	then
		lastChangeValue=`cat $lastChangeFile`
		lastChangeParameter="$lastChangeParameter$lastChangeValue"
	fi
fi

echo "Creando carpeta temporal"
mkdir -p $tempDirectory
cd $tempDirectory
index=0
for url in "${urls[@]}"
do
	stop=0
	offset=726000
	while [ $stop -eq 0 ]
	do
		echo "Bajando archivo ${nombres[index]}$offset.xml"
		echo "url: $url$offset$lastChangeParameter"
		curl --user $user:$password $url$offset$lastChangeParameter > ${nombres[index]}$offset.xml
		if grep -Fq "$resultNode" ${nombres[index]}$offset.xml
		then	
			echo "Moviendo archivo ${nombres[index]}$offset.xml"
			mv ${nombres[index]}$offset.xml $eanHotelsInput
			offset=$((offset + 1000))
		else
			stop=1
		fi
	done
	((index++))
done
echo "Borrando archivos temporales"
rm *.*
date +"%Y-%m-%d" > $lastChangeFile
exit 0