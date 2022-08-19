package com.hypergraph.linkedlistdetail_;

public class LinkedListDetail {
    /*
        一、LinkedList 底层 是双端链表 + 双端队列
        1、队列的头和尾
            transient Node<E> first;
            transient Node<E> last;
        2、结点结构
        内部类
            private static class Node<E> {
                E item;
                Node<E> next; // 下一结点
                Node<E> prev; // 前一个结点

                Node(Node<E> prev, E element, Node<E> next) {
                    this.item = element;
                    this.next = next;
                    this.prev = prev;
                }
            }
        二、构造器
        1、空构造器
        public LinkedList() {
        }
        transient int size = 0;
        三、add(Object obj)方法
        1、将元素链接到队尾
        public boolean add(E e) {
            linkLast(e);
            return true;
        }
        2、链接到队尾
        void linkLast(E e) {
            final Node<E> l = last; // l指向尾元素
            final Node<E> newNode = new Node<>(l, e, null); // 新建结点，前驱为l，内容为e，后继为null
            last = newNode; // 队尾指针指向新建结点
            if (l == null) // 新结点为第一个结点
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }
        四、删除结点方法
        1、list.remove("String");
        2、
        public boolean remove(Object o) {
            if (o == null) { // 删除元素为null
                for (Node<E> x = first; x != null; x = x.next) { // 遍历队列
                    if (x.item == null) {
                        unlink(x);
                        return true;
                    }
                }
            } else { // 删除元素不为null
                for (Node<E> x = first; x != null; x = x.next) { // 遍历队列
                    if (o.equals(x.item)) { // 使用equals()方法判断是否匹配
                        unlink(x);
                        return true;
                    }
                }
            }
            return false;
        }
        3、取消链接
        E unlink(Node<E> x) {
            // assert x != null;
            final E element = x.item; // 记录删除结点内容
            final Node<E> next = x.next; // 删除结点后继
            final Node<E> prev = x.prev; // 删除结点前驱

            // 链接前驱
            if (prev == null) { // 前驱为null，即输出结点为第一个结点
                first = next;
            } else { // 删除结点有前驱
                prev.next = next;
                x.prev = null;
            }

            // 链接后继
            if (next == null) { // 后继为null
                last = prev;
            } else {
                next.prev = prev;
                x.next = null;
            }

            x.item = null;
            size--;
            modCount++;
            return element;
        }
     */
}
