package com.ccc.sendalyzeit.textanalytics.algorithms.deeplearning.nn.matrix.jblas;

import org.apache.commons.math3.random.RandomGenerator;
import org.jblas.DoubleMatrix;

public interface NeuralNetwork {

	public abstract int getnVisible();

	public abstract void setnVisible(int nVisible);

	public abstract int getnHidden();

	public abstract void setnHidden(int nHidden);

	public abstract DoubleMatrix getW();

	public abstract void setW(DoubleMatrix w);

	public abstract DoubleMatrix gethBias();

	public abstract void sethBias(DoubleMatrix hBias);

	public abstract DoubleMatrix getvBias();

	public abstract void setvBias(DoubleMatrix vBias);

	public abstract RandomGenerator getRng();

	public abstract void setRng(RandomGenerator rng);

	public abstract DoubleMatrix getInput();

	public abstract void setInput(DoubleMatrix input);

}