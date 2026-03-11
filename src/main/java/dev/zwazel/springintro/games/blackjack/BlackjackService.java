/*
 * TODO: BlackjackService.java
 * Purpose:
 * - Implement all blackjack game rules and state transitions.
 *
 * Planned public methods:
 * - startGame(int bet)
 * - hit(UUID gameId)
 * - stand(UUID gameId)
 * - getGame(UUID gameId)
 *
 * Planned game logic:
 * - Deal two start cards to player and dealer
 * - Hit: draw one card for player, check bust
 * - Stand: dealer draws until at least 17
 * - Ace handling: count as 1 or 11 optimally
 * - Determine final result: player win / dealer win / push
 *
 * Storage note:
 * - Start with in-memory Map<UUID, BlackjackGame>.
 */
