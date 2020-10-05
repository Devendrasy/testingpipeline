package project.tools

def checkOut(REPO, BRANCH, REPO_CREDENTIALSID) {
  script {
     echo "checking out repo to $workspace"
     echo "Branch is set to $Branch"
     checkout([$class: 'GitSCM', branches: [[name: '*/'+BRANCH]], doGenerateSubmoduleConfigurations: false, extensions:[], submoduleCfg: [], userRemoteConfigs: [[credentialsId: REPO_CREDENTIALSID, url: REPO]]])
     }
}
return this
    
