package space.leonyew;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

@Environment(EnvType.CLIENT)
public class HelloHud {
    public static void render(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && client.player != null) {
            // 在屏幕左上角绘制 "Hello world"
            int x = 10;
            int y = 10;
            context.drawText(client.textRenderer, "Hello world", x, y, 0xFFFFFF, true);
        }
    }
}