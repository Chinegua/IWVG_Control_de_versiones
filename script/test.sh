#echo off
export workspace=/Users/chinegua/src_master/config/aitor.bernal.falcon.SVC.miw.upm.es
echo -----------------------------------------
echo ".(C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
cd $workspace
echo "============ mvn clean && test (profile: develop) ======================================================="
echo .
mvn clean -Denvironment.type=develop --settings settings.xml
mvn test -Denvironment.type=develop --settings settings.xml


