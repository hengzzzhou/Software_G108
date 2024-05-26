***#Git***

1. git安装配置
2. 加入`Group108`项目 [>>](https://github.com/hengzzzhou/Software_G108)
3. 配置SSH关联本地和git远程仓库
   1. 本地生成公私钥对
   2. 粘贴公钥到git仓库(在github的setting中)
4. `git clone git@github.com:hengzzzhou/Software_G108.git`
5. 尝试pull, push和版本回退

***#项目运行***

1. clone项目(见git部分的第4步)
2. Maven reload
3. run Main

***#文件架构***

1. View: 
   * 负责视图功能。
   * 存储利用JFormDesigner的设计后的Java代码。
   * 一个界面对应一个类。
   * 只允许主界面使用JFrame，其他界面使用JPanel。
2. Model
   * 负责逻辑实现。
   * 一个View中的类将对应一个Model中的类。Model中的类负责对应界面的逻辑实现，如密码校验
3. Control
   * 负责页面的连接功能。
   * 处理页面跳转的Event。
   * 管理所有页面的生命周期，拥有所有页面的实例。
4. Test1
   * *ToDo*

***#JFormDesigner***

设计UI的工具

见文档 [>>](https://taobao.starxg.com/static/docs.html?cardNo=5a4bd6319cd7421d984c1c56e13de31e)

