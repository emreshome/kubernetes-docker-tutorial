from flask import Flask, request, jsonify
import socket
app = Flask(__name__)


@app.route("/getlogic", methods=['GET'])
def getip():
    host_name = socket.gethostname() 
    host_ip = socket.gethostbyname(host_name) 
    return host_name + "/" + host_ip


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
