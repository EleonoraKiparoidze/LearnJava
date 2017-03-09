package com.nora.prometheus.week3.task1;

/**
 * Created by nora on 09.03.17.
 */
public class Node {
        private Node next;
        private Integer data;

        public Node() {
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Integer getData() {
            return data;
        }
        public void setData(Integer data) {
            this.data = data;
        }
    }

