'use strict';
/*eslint no-process-env:0*/

// Production specific configuration
// =================================
module.exports = {
  // Server IP
  ip: process.env.OPENSHIFT_NODEJS_IP
    || process.env.ip
    || undefined,

  // Server port
  port: process.env.OPENSHIFT_NODEJS_PORT
    || process.env.PORT
    || 8080,

  // MongoDB connection options
  mongo: {
    uri: process.env.MONGODB_URI
      || process.env.MONGOHQ_URL
      || process.env.OPENSHIFT_MONGODB_DB_URL + process.env.OPENSHIFT_APP_NAME
      || 'mongodb://viclang:1oYYa5rX3FDJa6I2@cluster0-shard-00-00-mg03r.mongodb.net:27017,cluster0-shard-00-01-mg03r.mongodb.net:27017,cluster0-shard-00-02-mg03r.mongodb.net:27017/comp3705?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin'
  }
};
