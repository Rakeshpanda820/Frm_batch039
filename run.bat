set projectLocation=C:\JAVA ECLIPSE\Frm_Batch039
 cd %projectLocation% 
set classpath=%projectLocation%\bin;%projectLocation%\lib\* 
java org.testng.TestNG %projectLocation%\testng.xml