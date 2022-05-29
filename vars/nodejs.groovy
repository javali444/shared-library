def lintChecks(){
    sh '''
    #~/node_modules/jslint/bin/jslint.js server.js
    echo Link Check 
    #echo Link Check for ${COMPONENT}
  '''
}
