//package core.net.packet.out;
//
//import core.net.packet.IoBuffer;
//import core.net.packet.OutgoingPacket;
//import core.net.packet.context.WindowsPaneContext;
//
//public class WindowsPaneSwitch implements OutgoingPacket<WindowsPaneContext> {
//
//    @Override
//    public void send(WindowsPaneContext context) {
//        System.out.println("Sending WindowPane Switch");
//        IoBuffer buffer = new IoBuffer(206);
//        buffer.putLEShort(0);
//        buffer.putLEInt(context.getPaneFrom() << 16 | context.getWindowPosFrom());
//        buffer.putIntB(context.getPaneTo() << 16 | context.getWindowPosTo());
//        context.getPlayer().getDetails().getSession().write(buffer);
//    }
//}
