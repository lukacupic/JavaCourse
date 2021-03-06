package hr.fer.zemris.bf.model;

import hr.fer.zemris.bf.parser.Parser;

/**
 * Represents a node visitor which visits nodes of the model tree
 * generated by the {@link Parser} object from the given expression.
 *
 * @author Luka Čupić
 */
public interface NodeVisitor {

    /**
     * Visits the given {@link ConstantNode} node.
     *
     * @param node the {@link ConstantNode} node to visit
     */
    void visit(ConstantNode node);

    /**
     * Visits the given {@link VariableNode} node.
     *
     * @param node the {@link VariableNode} node to visit
     */
    void visit(VariableNode node);

    /**
     * Visits the given {@link UnaryOperatorNode} node.
     *
     * @param node the {@link UnaryOperatorNode} node to visit
     */
    void visit(UnaryOperatorNode node);

    /**
     * Visits the given {@link BinaryOperatorNode} node.
     *
     * @param node the {@link BinaryOperatorNode} node to visit
     */
    void visit(BinaryOperatorNode node);
}