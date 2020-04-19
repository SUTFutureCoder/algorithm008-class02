## 学习笔记
### 用 add first 或 add last 这套新的 API 改写 Deque 的代码 
请见 [源码](https://github.com/SUTFutureCoder/algorithm008-class02/blob/master/Week_01/ChangeDeque.java)    

### 分析 Queue 和 Priority Queue 的源码  
* Queue是一个接口  
* Queue接口提供```add```，```offer```，```remove```，```poll```，```element```，```peek```方法  
* ```poll```，```element```，```peek```方法当队列为空时不会抛错  
* PriorityQueue扩展了AbstractQueue抽象类，AbstractQueue抽象类实现了Queue接口    
* PriorityQueue使用数组实现平衡二叉堆，使用前需要实现Comparator、如果不实现则按照elements默认排序  
* PriorityQueue默认长度为11  
* add和offer操作一致，先判断是否为null，如空间不足则进行扩展，然后对新元素堆调整    
* peek先检查大小，如size为0则返回null，否则返回堆顶  
* remove,poll直接删除堆顶，然后对堆进行调整     
* remove(o)先找到元素位置，如果元素在叶节点直接移除，否则重新堆调整  
