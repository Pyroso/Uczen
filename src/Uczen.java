public interface Uczen extends Comparable<Uczen>{

    void uczSie();

    @Override
    default int compareTo(Uczen o) {
        String nazwa = getClass().getName();
        String nazwaDruga = o.getClass().getName();
        return nazwa.length() - nazwaDruga.length();
    }
}
