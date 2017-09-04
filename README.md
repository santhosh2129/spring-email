use admin
db.createUser(
  {
    user: "santhosh2129",
    pwd: "santhosh2129",
    roles: [ { role: "userAdmin", db: "santhosh2129" } ]
  }
)

starts at http://localhost:9003/

POST /santhosh2129/email/send

{
  "emailId": "string",
  "message": "string"
}

post on rabbit mq
