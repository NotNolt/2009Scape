package core.net.packet.out;

import plugin.skill.Skills;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.SkillContext;

/**
 * Handles the update skill outgoing packet.
 * @author Woah
 */
public final class SkillLevel implements OutgoingPacket<SkillContext> {

	@Override
	public void send(SkillContext context) {
		System.out.println("Sending SkillContext || Outgoing");
		final IoBuffer buffer = new IoBuffer(38);
		Skills skills = context.getPlayer().getSkills();
		buffer.putA(skills.getLevel(context.getSkillId()));
		buffer.putIntA((int) skills.getExperience(context.getSkillId()));
		buffer.putC(context.getSkillId());
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}