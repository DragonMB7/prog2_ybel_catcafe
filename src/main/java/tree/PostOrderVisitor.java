package tree;

import java.lang.Comparable;

public class PostOrderVisitor<T extends Comparable<T>> implements TreeVisitor<T> {

    @Override
    public String visit(Empty<T> node){

        return null;

    }


    @Override
    public String visit(Node<T> node) {

        String path = "";

        if(!node.leftChild().isEmpty()){ path += this.visit((Node<T>) node.leftChild()); }
        if(!node.rightChild().isEmpty()){ path += this.visit((Node<T>) node.rightChild()); }
        path += " -> " + node.toString();

        return path;

    }

}
