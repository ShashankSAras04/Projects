package org.Practise;


    class Outer {
        void display()
        {
            System.out.println(10);
            Inner ob = new Inner();
            ob.num();
        }


        class Inner
        {
            void num()
            {
                System.out.println(199);
                display();
            }


        }

    }
    class p1 {
        public static void main(String[] args) {
            Outer out = new Outer();
            out.display();
            Outer.Inner obj = out.new Inner();
            obj.num();

        }
    }

