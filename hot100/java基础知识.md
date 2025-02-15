
## 1. map的merge方法
```java
Map<Integer, Integer> cnt = new HashMap<>(n + 1); 
cnt.merge(sj, 1, Integer::sum); //对键为 sj 的值进行计数，如果键 sj 不存在，则将其值初始化为 1；如果键 sj 已经存在，则将其对应的值加 1
```
## 2. 创造双端队列
```java
Deque<Integer> deque = new ArrayDeque<>();
// 在队列头部添加元素
deque.addFirst(1);
deque.offerFirst(2);
// 在队列尾部添加元素
deque.addLast(3);
deque.offerLast(4);


// 从队列头部移除元素
Integer firstElement = deque.removeFirst();
// 从队列尾部移除元素
Integer lastElement = deque.removeLast();
```
## 3.二维数组根据每个元素第一个值排序
```java
int[][] intervals;
Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));
```
## 4.List转数组
```java

List<int[]> merged = new ArrayList<>();
merged.toArray(new int[merged.size()][]);
```
