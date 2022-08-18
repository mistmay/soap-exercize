# soap-exercize

SoapIdCard is provider app. WsImport 2 client app.

Classes are generated from wsdl through script:

<plugins>
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>jaxws-maven-plugin</artifactId>
				<version>2.6</version>
				<executions>
					<execution>
						<goals>
							<goal>wsimport</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<wsdlDirectory>${project.basedir}/src/main/resources/wsdl/</wsdlDirectory>
					<packageName>com.advancia.wsImport2.ws.client</packageName>
					<sourceDestDir>
            ${project.build.directory}/generated-sources/
        </sourceDestDir>
				</configuration>
			</plugin>
		</plugins>
