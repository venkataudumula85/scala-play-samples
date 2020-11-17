FROM 3.139.194.242:8083/ubi-minimal:8.1        
#install Openjdk      
RUN microdnf install java-1.8.0-openjdk 
#copy the rpm to opt                
COPY target/rpm/RPMS/noarch/play-scala-forms-example*.rpm /opt
# run the rpm install & remove rpm
RUN rpm -i /opt/play-scala-forms-example-*.rpm && \    
rm -rf /opt/play-scala-forms-example-*.rpm          
EXPOSE 9000
#use the binary to execute during runtime
CMD ["/usr/bin/play-scala-forms-example"]
