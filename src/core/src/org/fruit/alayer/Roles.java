/******************************************************************************************
 * COPYRIGHT:                                                                             *
 * Universitat Politecnica de Valencia 2013                                               *
 * Camino de Vera, s/n                                                                    *
 * 46022 Valencia, Spain                                                                  *
 * www.upv.es                                                                             *
 *                                                                                        * 
 * D I S C L A I M E R:                                                                   *
 * This software has been developed by the Universitat Politecnica de Valencia (UPV)      *
 * in the context of the european funded FITTEST project (contract number ICT257574)      *
 * of which the UPV is the coordinator. As the sole developer of this source code,        *
 * following the signed FITTEST Consortium Agreement, the UPV should decide upon an       *
 * appropriate license under which the source code will be distributed after termination  *
 * of the project. Until this time, this code can be used by the partners of the          *
 * FITTEST project for executing the tasks that are outlined in the Description of Work   *
 * (DoW) that is annexed to the contract with the EU.                                     *
 *                                                                                        * 
 * Although it has already been decided that this code will be distributed under an open  *
 * source license, the exact license has not been decided upon and will be announced      *
 * before the end of the project. Beware of any restrictions regarding the use of this    *
 * work that might arise from the open source license it might fall under! It is the      *
 * UPV's intention to make this work accessible, free of any charge.                      *
 *****************************************************************************************/

/**
 *  @author Sebastian Bauersfeld
 */
package org.fruit.alayer;

public final class Roles {
	private Roles(){}
	
	public static final Role 
	
	Widget = Role.from("Widget"),
	Invalid = Role.from("Invalid"), // by wcoux
	Control = Role.from("Control", Widget),
	Expander = Role.from("Expander", Control),
	Hider = Role.from("Hider", Control),
	Button = Role.from("Button", Control),
	StateButton = Role.from("StateButton", Button),
	ToggleButton = Role.from("ToggleButton", StateButton),
	Item = Role.from("Item", Control),
	ItemContainer = Role.from("ItemContainer", Control),
	Text = Role.from("Text", Control),
	Decoration = Role.from("Decoration", Control),
	Slider = Role.from("Slider", Control),
	Dialog = Role.from("Dialog", Control),
	MessageBox = Role.from("MessageBox", Dialog),
	DragSource = Role.from("DragSource", Control),
	DropTarget = Role.from("DropTarget", Control),
	SUT = Role.from("SUT"),
	System = Role.from("System", Widget),
	Process = Role.from("Process", System);	
}