@Library('<libraryname>') _
import tools.*


pipeline{
  agent{
    label '<agentname>'
  }
  
  tools {
      maven 'maven'
      jdk ''java8'
  }
  
  triggers{
    gitlab(triggerOnPush: true, trigger On MergeRequest: true, branchFilterType: 'All')
  }
  
  stages{
    stage("Clean"){
        steps{
        
          script{
              deleteDir()
              echo "Emptied directory before clone....."
              }
        }
     }
     
     stage("Clone") {
         steps {
            script {
                flagDeployQASuccess = 'false'
                //get repo name and branch from Git then set build name
                REPO = env.gitlabSourceRepoURL
                BRANCH = env.gitlabbranch
                APPNAME = env.gitlabSourceRepoName
                REPO_CREDENTIALSID = 'JENKINS AND GIT SSH KEY ID NAME'
                currentBuild.displayName = "BRANCH:${BRANCH}, BUILD:#${Build_number}"]
                echo ""App Name = $APPNAME"
                
              }
              
              script{
              //checkout git repo
              def gitrepo = new my.tools.git()
              gitrepo.checkOut(REPO, BRANCH, REPO_CREDENTIALSID)
              }
              
              
   
