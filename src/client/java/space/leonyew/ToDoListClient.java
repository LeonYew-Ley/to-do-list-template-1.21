package space.leonyew;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class ToDoListClient implements ClientModInitializer {
	@Override
	public void onInitialize() {
		// 服务端初始化内容
	}

	@Override
	public void onInitializeClient() {
		HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
			HelloHud.render(drawContext);
		});
	}
}