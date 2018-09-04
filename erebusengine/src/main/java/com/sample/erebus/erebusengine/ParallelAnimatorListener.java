package com.sample.erebus.erebusengine;

/**
 * This method is called when the parallel animation ends.
 *
 * 
 */
public interface ParallelAnimatorListener {

	/**
	 * This method is called when the parallel animation ends.
	 * 
	 * @param parallelAnimator
	 *            The ParallelAnimator object.
	 */
	public void onAnimationEnd(ParallelAnimator parallelAnimator);
}