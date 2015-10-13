#!/bin/sh

cd mate-search-test-ui && mvn clean install jboss-as:deploy && cd .. && mvn clean install && cd feed-downloader && mvn jboss-as:deploy && cd .. && cd hotel-mapper && mvn jboss-as:deploy && cd .. && cd destination-mapper && mvn jboss-as:deploy && cd .. && cd mate-search && mvn jboss-as:deploy && cd ..
