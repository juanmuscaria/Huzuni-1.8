package net.halalaboos.huzuni.api.task;

import net.halalaboos.huzuni.api.node.attribute.Dependent;
import net.halalaboos.huzuni.api.node.attribute.Nameable;

/**
 * Tasks which occur only when requested to a task manager and only if the task holder who sends the request has the highest priority.
 * */
public interface Task extends Dependent {

    /**
     * Invoked when the task has been cancelled (or replaced by another task)
     * */
	void onTaskCancelled();

    /**
     * Invoked before updating the player positions/rotations.
     * */
	void onPreUpdate();

    /**
     * Invoked after updating the player positions/rotations.
     * */
	void onPostUpdate();

	/**
	 * @return The handler for this task.
	 * */
	Nameable getHandler();

	boolean isRunning();

	void setRunning(boolean running);
}
