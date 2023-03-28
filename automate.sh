#Display message


echo "GITHUB JAVA-PROBLEMS-HACKER-RANK"
echo


#Read File name and content to generate file
createFileWithContent()
{
  read -p 'File Name: ' fileName
  vim $fileName.java
}

gitCommandsToPush()
{
echo
git status
echo
git add .
echo "FILES ADDED SUCCESSFULLY"
echo
git status
echo
read -p 'Enter Commit Message: ' commitMsg
echo
git commit -m $commitMsg
echo
git status
echo
}

#Functions
#Read File name and content to generate file
createFileWithContent
#Git commands to push the local changes to cloud on github
gitCommandsToPush




