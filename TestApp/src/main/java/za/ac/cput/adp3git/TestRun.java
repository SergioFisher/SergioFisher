package za.ac.cput.adp3git;

public class TestRun {


        private String a;
        private String b;

        public TestRun(){}

        public TestRun(String a, String b)
        {
            this.a = a;
            this.b = b;
        }

        public String getA()
        {
            return a;
        }

        public void setA(String a)
        {
            this.a = a;
        }

        public String getB()
        {
            return b;
        }

        public void setB(String b)
        {
            this.b = b;
        }

        @Override
        public String toString()
        {
            return "Test=" + "a=" + a + '\' + ", b=" + b;
        }
}

