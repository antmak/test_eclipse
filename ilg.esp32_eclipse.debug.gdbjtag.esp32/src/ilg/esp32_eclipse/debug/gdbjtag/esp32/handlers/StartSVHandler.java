package ilg.esp32_eclipse.debug.gdbjtag.esp32.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import ilg.esp32_eclipse.debug.gdbjtag.dsf.GnuArmFinalLaunchSequence;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StartSVHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Esp32",
				"Start SV");
		String start_cmd = "monitor esp32 sysview start file://pro_test.txt file://app_test.txt"; 
		GnuArmFinalLaunchSequence.Exec_queueCommand(start_cmd);
				
		return null;
	}
}
