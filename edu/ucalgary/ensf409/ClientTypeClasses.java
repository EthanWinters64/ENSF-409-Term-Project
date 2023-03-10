package edu.ucalgary.ensf409;
public enum ClientTypeClasses{
    ADULT_MALE{
        @Override
        public String toString(){
            return "Adult Male";
        }
    },
    ADULT_FEMALE{
        @Override
        public String toString(){
            return "Adult Female";
        }
    },
    CHILD_OVER_EIGHT{
        @Override
        public String toString(){
            return "Child over 8";
        }
    },
    CHILD_UNDER_EIGHT{
        @Override
        public String toString(){
            return "Child under 8";
        }
    };
    public abstract String toString();
}