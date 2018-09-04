package com.sample.erebus.erebusengine;

/**
 * This interface is a custom listener to determine the end of an animation.
 *
 *
 */
public interface AnimationListener {

	/**
	 * This method is called when the animation ends.
	 * 
	 * @param animation
	 *            The Animation object.
	 */
	public void onAnimationEnd(Animation animation);
}

