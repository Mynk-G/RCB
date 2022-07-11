# RCB
This project is designed to validate foreign players and wicket keeper players present in team.

# How to Install and Run the Project.
1. Create a MVN project.
2. Paste this packages into src/test/java folder.
3. Add this depedencies in pom.xml:
		<dependencies>

		<!-- https://mvnrepository.com/artifact/org.json/json -->
		<dependency>
			<groupId>org.json</groupId>
			<artifactId>json</artifactId>
			<version>20220320</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.5</version>
			<scope>test</scope>
		</dependency>

	</dependencies>
4. Create testng.xml file for testcase package.
	(To create testng.xmk file: right click on testcase package > TestNG > Convert to TestNG)
5. Run testng.xml file as TestNG Suite.
