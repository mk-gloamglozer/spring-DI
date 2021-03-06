package com.mkdevs.domain;

import java.util.List;

import com.mkdevs.IDable;
import com.mkdevs.domain.DiceFactory.DiceType;

public interface DiceFactory {

	public interface DiceType extends IDable{
	}

	Dice createDice(String type, String name)
		throws IllegalArgumentException;

	List<DiceType> availibleTypes();
}
