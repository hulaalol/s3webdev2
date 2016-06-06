var EventEmitter = require('events').EventEmitter;
var emitter = new EventEmitter();

emitter.on('say hello', function(name){
           console.log('Hello ' + name + ' , how do you do?');
           });

emitter.emit('say hello','Hugo');



