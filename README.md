# Search-Engine
搜索引擎：字典树+树的先序遍历+提供JNI给Java调用

通过c++编写搜索引擎逻辑的字典树，此版本1.0只考虑先序遍历的情况，效果类似谷歌搜索引擎

为了传给web功能用途，所以把c++编写的逻辑做成包的形似给Java调用，Java通过调用jni获得需要功能

具体操作过程参考本人的CSDN博客，关于Java通过jni调用c++的流程，https://blog.csdn.net/qq_38931949/article/details/80087899
