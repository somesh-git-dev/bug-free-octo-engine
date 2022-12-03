public interface JavaFile {
    default void free(){

        System.out.println(1);
        System.out.println(2);
    }

    default int fuck(){
        return 1;
    }
}
