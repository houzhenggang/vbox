package com.probridge.vbox.zk.vmodel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import com.probridge.vbox.model.VM;
import com.probridge.vbox.servlet.DeleteVboxTask;

public class VboxDelete extends ProgressViewModel {
	private VM vm;

	@Init
	public void init() {
		vm = (VM) _execution.getArg().get("vm");
		globalCommandName = "reloadVmList";
	}

	@Command
	@NotifyChange({ "progress", "progressMsg", "started", "running", "closeBtnLabel" })
	public void delete() {
		DeleteVboxTask t = new DeleteVboxTask(getSid(), getOpId(), vm.getVmId());
		submit(t);
		return;
	}

	public VM getVm() {
		return vm;
	}

	public void setVm(VM vm) {
		this.vm = vm;
	}
}
