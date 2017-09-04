use admin
db.createUser(
  {
    user: "santhosh2129",
    pwd: "santhosh2129",
    roles: [ { role: "userAdmin", db: "santhosh2129" } ]
  }
)