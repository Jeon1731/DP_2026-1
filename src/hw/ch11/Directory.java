package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        entry.setParent(this); //자식 엔트리에게 부모(현재 디렉토리)를 설장한다.
        return this;
    }

    @Override
    public List<Entry> search(String keyword) {
        List<Entry> searchList = new ArrayList<Entry> ();
        if(name.contains(keyword))
            searchList.add(this); // List.add(Entry)
        for(Entry entry: directory) {
            searchList.addAll(entry.search(keyword)); // List.addAll(List)
        }
        return searchList;
    }
}
