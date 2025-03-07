# Phecda 物联网关
对于可以直接连接网络的设备，我们可以不需要通过边缘端去进行处理，直接将数据发送到云端网关。在网关进行数据处理，将数据处理成平台标准格式，发送到平台侧进行后续处理。

## 本地安装
* 下载源码
* 配置文件
  
    将serve模块下resources文件夹中的application-example.properties 复制为 application-default.properties 

## 协议接入
对于不同的协议类型，引入对应的jar包即可

处理逻辑
所有的处理实现类都实现接口 `com.trionesdev.phecda.gateway.core.GatewayHandler`

对于不同协议的处理，我们引入对应协议的jar包。继承对应的抽象函数，实现 其中的匹配逻辑和处理逻辑。
```kotlin
interface GatewayHandler {
    fun postProperties(properties: PhecdaEvent)
    fun postEvents(properties: PhecdaEvent)
    fun sendCommand(command: PhecdaCommand)
}
```
## GatewayHandlerComponent注解
注解用来标记网关处理器，@GatewayHandlerComponent(productKeys = mqtt1) ，工程启动的时候，会去扫描这个注解，根据productKeys将对应的处理器和productKey形成mapping。如果不加该注解，将无法被扫描到，不配置 productKeys 属性，则无法下发指令。

## 默认处理逻辑
如果设备端能直接上报满足平台数据格式的协议，那么便无需特殊处理，每种协议，我们都提供了默认处理以适配Phecda默认的数据格式。以Mqtt为例，在mqtt process的jar包中，定义了一个 PhecdaMqttGatewayHandler 类，对符合平台数据标准的进行处理。我们只需要继承对应的类，并加上相关注解即可。
```kotlin
@GatewayHandlerComponent(productKeys = {"p1","p2"})
public class PhecdaDefaultMqttGatewayProcessor extends PhecdaMqttGatewayProcessor {
}
```

## 互相吹捧，共同进步

<div style="width: 100%;text-align: center;">
   <img src="images/shuque_wx.jpg" width="200px" alt="">
</div>