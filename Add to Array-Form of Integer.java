int size=num.length,carry=0;
        LinkedList<Integer> list=new LinkedList<>();
        int a=0;
        while(size>0 || k>0)
        {
            if(size>=1) a=num[--size];
            else a=0;
            int x=a+k%10+carry;
            list.addFirst(x%10);
			carry=x/10;
            k/=10;
        }
        if(carry>0) list.addFirst(carry);
        return list;
