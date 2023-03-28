#Display message
echo
echo
echo "====================GITHUB JAVA-PROBLEMS-HACKER-RANK===================="
echo

#Read File name and content to generate file
createFileWithContent()
{
  read -p 'ENTER FILE NAME: ' fileName
  vim $fileName.java
}

gitCommandsToPush()
{
echo
git status
echo
git add .
echo "====================FILES ADDED SUCCESSFULLY===================="
echo
git status
echo
read -p 'ENTER COMMIT MESSAGE: ' commitMsg
echo
git commit -m "$commitMsg"
echo
git status
echo
echo "====================PUSH COMMAND IN PROCESSS===================="
git push origin main
echo
echo "====================FILES PUSHED SUCCESSFULLY===================="
echo
}


flag=1
#Loop to iterate until user enters "q" else continue to execute
while [ $flag -ne 0 ]
do
 #Functions
 #Read File name and content to generate file
 createFileWithContent
 #Git commands to push the local changes to cloud on github
 gitCommandsToPush
 read -p '==> ENTER "1" TO CONTINUE OR "0" TO EXIT: ' flag
done





