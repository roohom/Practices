# 集合

## 内部类
概念:在一个类中定义另一个类

- 两种内部类
    - 成员内部类
    书写的位置和成员变量、成员方法在同一个位置(方法外)
        ~~~java
        public class Person{
              //成员内部类
              public class InnerClass{
              
              }
        }
        ~~~
  
    - 局部内部类
        - 局部内部类
            - 书写在成员方法内
            - 不能使用访问修饰符
            
### 匿名内部类
匿名内部类:匿名对象+子类
- 匿名对象
    - Student stu = new Student();创建一个Student对象
        - 访问方法:stu.method()
    - 匿名对象格式:
        - 书写格式:new Student()
        - 访问内部成员方法 new Student().method()                
    - 作用:通常用于作实参传递
    
    
- 子类
    - ~~~java
      //父类
      abstract class Person{
          abstract void eat();
      }
      
      class Student exdents Person{
          public void eat(){
          }
      }
      ~~~
      
- 匿名内部类+子类
一个继承了类或者接口的子类对象
~~~java
new Student
{
    //重写方法
    public void eat(){
    }
} 
~~~
- 使用   
    - 1.当抽象类或接口中没有过多方法使用也比较少，可以考虑使用匿名内部类的方式  
    - 2.匿名内部类可以作为方法的实参进行传递
    
## 集合
- 概念:
    - 集合是用来存储多个同类型的数据的容器，它的长度是可以变化的
- 集合的体系结构  
    ~~~
        Collection接口:  
        |--- List接口:  
            |---ArrayListL类:  
            |---LinkedList类:  
        |--- Set接口:  
            |---Hash类:  
            |---TreeSet类:        
    ~~~
> 归属于Java.util

- Collection是一个接口，属于java集合体系中顶层的父接口，该接口下有两大体系:List、Set   
    - List特点:有序、可重复
    - Set特点:无序、唯一

- 使用方式
    - 属于接口，无法实例化，需要借助子类,通过多态的方式创建子类对象
    - collection coll = new ArrayList();
- 常用方法
    - 添加:public boolean add(Object obj);
    - 删除 public boolean remove(Object obj);
    - 修改 在遍历的过程中针对某个元素进行修改
    - 查询 需要借助迭代器进行遍历查询  
    - 获取元素个数 public int size();
    - 是否包含某个元素 public boolean contains(Object obj);
    - 清空所有元素 public void clear();
    - 判断是否为空 public boolean isEmpty();
> 集合内装的元素都经过了类型提升为Object(比如整形经过了自动装箱)    

### 泛型:约束的类型
常用于创建集合时使用，用来约束集合中可以存储的元素的类型

### 集合的遍历
- 集合没有类似数组一样的索引，无法利用索引进行遍历，需要借助迭代器
    - Iterator it = Collection.iterator();
    - 常用方法:
        - public boolean hasNext()	//判断迭代器中是否还有下一个元素.
        - public E next()			//获取迭代器中的下一个元素. 
        
        
- 集合遍历的大致过程
    - 1.创建集合对象.
    - 2.创建元素对象.
    - 3.把元素添加到集合中.
    - 4.遍历集合
        - 1.根据集合对象获取其对应的迭代器对象.
          通过Collection#iterator()方法实现.
        - 2.判断迭代器中是否有下一个元素.
          通过Iterator#hasNext()方法实现.
        - 3.如果有, 就获取该元素.
          通过Iterator#next()方法实现.
    - 案例:
    ~~~java
      //案例: 演示Collection集合存储自定义对象, 并遍历
      public class Demo {
          public static void main(String[] args) {
              //1. 创建集合对象.
              Collection<Student> coll = new ArrayList<>();
              //2. 创建元素对象.
              Student s1 = new Student("刘亦菲", 33);
              Student s2 = new Student("赵丽颖", 31);
              Student s3 = new Student("高圆圆", 35);
              //Student s4 = new Student("丹丹", 18);
              //3. 把元素对象添加到集合对象中.
              coll.add(s1);
              coll.add(s2);
              coll.add(s3);
              //coll.add(s4);
              //4. 遍历集合.
              //4.1 根据集合对象获取其对应的迭代器对象. Collection#iterator();
              Iterator<Student> it = coll.iterator();
              //4.2 判断迭代器中是否有下一个元素. Iterator#hasNext();
              while (it.hasNext()) {
                  //4.3 有就获取. Iterator#next();
                  Student stu = it.next();
                  System.out.println(stu);
      
                  //不能写成如下的形式, 因为next()方法调用一次, 就会获取一个值.
                  //下边这个代码就属于: 判断一次, 获取两个值.
                  //System.out.println(it.next().getName() + "..." + it.next().getAge());
              }
          }
    ~~~          
        
### List集合
- 特点:
    - 1.存取元素有序。存储元素的顺序和取出元素的顺序一致
    - 2.list集合允许存储重复元素
    - 3.list集合中有索引。可以利用索引精确访问集合中的每一个元素
    
- 创建:
    - List是一个接口，无法实例化，需要借助子类
    - List list = new ArrayList();
    - List继承了Collection,父接口的相关功能，list集合也可以使用
    
- 常用方法(特有方法):
    - 添加 void add(int index, Object obj)
    - 修改 Object set(int index, Object obj) //指定索引位置上的元素修改为Obj，并返回修改之前的元素
    - 删除 
        - boolean remove(Object obj)
        - Object remove(int index) 删除指定位置元素并返回旧元素
    - 查询 
        - Object get(int index) 查询到元素并返回
        - int indexOf(Object obj)
    
    - 遍历
        - iterator迭代器(见ListDemo4.java)
        - ListIterator迭代器(专有)
- 迭代器
    - 普通迭代器的弊端
        - 在迭代遍历时，如果向list集合中添加新元素，迭代器会引发异常:ConcurrentModificationException
        - 解决办法:
            - 使用专用迭代器:ListIterator (ListIterator listIt = list.ListIterator())  
    
    
## 增强For循环
增强for循环是用来遍历的，针数组和集合的遍历
- 弊端
    - 只能用来遍历
    - 增强for的底层其实是通过迭代器(Iterator)实现的

- 格式:
~~~java
int[] arr = {11,22,33,44,55};

for(元素类型 变量名 : array){
    //直接使用变量名就可以获取到array中的每一个元素
}

//集合
List list = new ArrayList();
for(元素类型 元素名: list){
    //打印
}
~~~    
> 在循环过程中不能向集合中添加元素或者删除元素
    
    
        