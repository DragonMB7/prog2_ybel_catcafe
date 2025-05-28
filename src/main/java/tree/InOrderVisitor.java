package tree;

import java.lang.Comparable;

public class InOrderVisitor<T extends Comparable<T>> implements TreeVisitor<T>{



    @Override
    public String visit(Empty<T> node){

        return null;

    }

    @Override
    public String visit(Node<T> node) {

        String path = " -> ";

        if(!node.leftChild().isEmpty()){ path += this.visit((Node<T>) node.leftChild()); }
        path += node.toString();
        if(!node.rightChild().isEmpty()){ path += this.visit((Node<T>) node.rightChild()); }

        return path;

    }

}
