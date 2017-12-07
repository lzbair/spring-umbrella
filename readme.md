Get Access token:
curl -H "Authorization:Basic bGFoY2VuOmx6YmFpcg==" -X POST -d "username=lahcen&password=lzbair" http://127.0.0.1:9001/oauth/token?grant_type=password

Get Ressource:
curl http://127.0.0.1:9000/user/Me?access_token=<token_id_here>