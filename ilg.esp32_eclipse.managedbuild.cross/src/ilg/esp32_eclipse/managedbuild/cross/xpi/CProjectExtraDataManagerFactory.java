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

package ilg.esp32_eclipse.managedbuild.cross.xpi;

import ilg.esp32_eclipse.debug.core.data.ICProjectExtraDataManager;
import ilg.esp32_eclipse.debug.core.data.ICProjectExtraDataManagerFactory;

public class CProjectExtraDataManagerFactory implements ICProjectExtraDataManagerFactory {

	// ------------------------------------------------------------------------

	public CProjectExtraDataManagerFactory() {
		;
	}

	// ------------------------------------------------------------------------

	// Create a DataManager object
	@Override
	public ICProjectExtraDataManager create() {

		return CProjectExtraDataManager.getInstance();
	}

	@Override
	public void dispose() {
		;
	}

	// ------------------------------------------------------------------------
}
