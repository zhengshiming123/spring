<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/11/23
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">

        var url = 'ws://'+window.location.host+'<%=request.getContextPath()%>/hello';


        var sock = new WebSocket(url) //打开socket
        sock.onopen = function () {     //处理连接开启事件
            console.log('开启websocket连接')
            sayHello();
        }
        sock.onmessage = function (e) {
            console.log("接收消息： ", e.data);
            setTimeout(function () {
                sayHello()
            },200)
        }
        sock.onclose = function () {
            console.log('关闭websocket连接')
        }
        function sayHello() {   //发送消息

            console.log("发送消息 ： helloworld")
            sock.send('hello world!');
        }
    </script>
</head>
<body>
    helloWord
</body>
</html>
