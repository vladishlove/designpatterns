package com.designpatterns.command;

import com.designpatterns.command.command.Command;

public class RemoteControl {
	private int slotsSize;
	private Command[] slots;
	private Command rollBackCommand;

	public RemoteControl(int slotsSize) {
		this.slotsSize = slotsSize;
		slots = new Command[slotsSize];
	}

	public void addCommandToFirstEmptySlot(Command command) throws Exception {
		Integer emptySlotIndex = null;
		for (int i = 0; i < slotsSize; i++) {
			if (slots[i] == null) {
				emptySlotIndex = i;
			}
		}

		if (emptySlotIndex != null) {
			slots[emptySlotIndex] = command;
		} else {
			System.out.println("No available slots");
		}

	}

	public void setCommand(Command command, int slotIndex) throws Exception {
		validateSlotIndex(slotIndex);

		if (slots[slotIndex] == null) {
			slots[slotIndex] = command;
		} else {
			System.out.println("Slot is occupied");
		}
	}

	private void validateSlotIndex(int slotIndex) throws Exception {
		if (slotIndex >= slots.length) {
			throw new Exception("slot index is greater than slots size");
		}
	}

	public void clearSlot(int slotIndex) throws Exception {
		validateSlotIndex(slotIndex);
		slots[slotIndex] = null;
	}

	public void pressTheButton(int buttonNumber) throws Exception {
		Integer slotIndex = null;
		if (buttonNumber > 0) {
			slotIndex = buttonNumber - 1;
		}

		if (slotIndex != null) {
			validateSlotIndex(slotIndex);
			Command slot = slots[slotIndex];
			if (slot != null) {
				slot.execute();
				rollBackCommand = slot;
			} else {
				System.out.println("can't execute empty slot");
			}
		}
	}

	public void rollBack() {
		rollBackCommand.rollBack();
	}
}
