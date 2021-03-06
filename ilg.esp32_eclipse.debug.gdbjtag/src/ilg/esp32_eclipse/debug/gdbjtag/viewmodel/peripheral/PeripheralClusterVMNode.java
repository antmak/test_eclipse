/*******************************************************************************
 * Copyright (c) 2014 Liviu Ionescu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Liviu Ionescu - initial version 
 *     Espressif Systems Ltd — ESP32 support
 *******************************************************************************/

package ilg.esp32_eclipse.debug.gdbjtag.viewmodel.peripheral;

import ilg.esp32_eclipse.debug.gdbjtag.datamodel.SvdDMNode;

public class PeripheralClusterVMNode extends PeripheralGroupVMNode {

	// ------------------------------------------------------------------------

	public PeripheralClusterVMNode(PeripheralTreeVMNode parent, SvdDMNode dmNode) {

		super(parent, dmNode);

	}

	// ------------------------------------------------------------------------

	@Override
	public String getDisplayNodeType() {
		return "Cluster";
	}

	@Override
	public String getImageName() {
		return "registergroup_obj";
	}

	@Override
	public String getDisplaySize() {
		return null;
	}

	// ------------------------------------------------------------------------
}
