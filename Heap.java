 //堆的插入
     public void push(int val) {
         if(isFull()) {
             this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);//扩容
             this.elem[this.usedSize] = val;
             this.usedSize++;
             adjustUp(this.usedSize-1);
         }
     }
     public boolean isFull() {
         return this.usedSize == this.elem.length;
     }

//堆的删除
    public void pop() {
         if(isEmpty()) {
             return;
         }
        //交换堆顶和最后一个元素
        int tmp =this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        adjustDown(0,this.usedSize);
     }
     public boolean isEmpty() {
         return this.usedSize == 0;
     }